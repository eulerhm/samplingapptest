#A script to manage the test suite execution
import csv
import random
from subprocess import check_output
from time import perf_counter

#The imput setting file
fileName = 'configCombinations-MostEnabledDisabled_new.csv'
totalExecutions = 3 #Multiple executions to deal with flaky tests

#The output folder for test reports
print(check_output("mkdir testReportsMult-MostEnabledDisabled", shell="True").decode('cp850'))
print()

with open(fileName) as csv_file:
    csv_reader = csv.reader(csv_file, delimiter=',')
    line_count = 0
 
    allConfig = {}

    #Initialize a dictionary with the settings
    for row in csv_reader:
        config = {'location':False,'wifi':False,'mobiledata':False,'bluetooth':False,'autorotate':False,'batterysaver':False,'donotdisturb':False, 'camera':False,'accelerometer':False,'gyroscope':False,'light':False,'magneticfield':False,'orientation':False,'proximity':False} 

        for column in row:
        	if (column != ''):
        		config[column] = True

        allConfig[f"c{line_count}"] = config

        keys = list(allConfig.keys())
        
        line_count += 1

    #print(allConfig)
    print(f'Processed {line_count} combinations.')

    #Output files for logging the execution order of the settings and the CPU execution time of the test suite
    execFile = open("executionLog-MostEnabledDisabled.txt","a")
    execTimeFile = open("executionTime-MostEnabledDisabled.txt","a")

    currentExec = 1
    while currentExec <= totalExecutions:
        print(f"Execution:{currentExec}")
        
        print(check_output(f"mkdir testReportsMult-MostEnabledDisabled/execution{currentExec}", shell="True").decode('cp850'))
        print()
        
        #Shuffled the settings to minimize order dependencies between tests
        random.shuffle(keys)
        
        execFile.write(f"Execution {currentExec} configurations \n")
        str1 = '-'.join(keys)
        execFile.write(str1)
        execFile.write("\n")
        execFile.flush()

        for k in keys:
            cf = allConfig[k]	
            print(f"config: {cf}")
            startTime_Config = perf_counter() #perf_counter is a function to access a performance counter to measure the test suite execution time (https://docs.python.org/3/library/time.html)
            
            
            #Some devices require this adb command to allow the battery saver interaction
            command1 = f"adb shell dumpsys battery unplug"
            print(check_output(command1, shell=True).decode('cp850'))
            print()
            
            command = f"./gradlew -Pandroid.testInstrumentationRunnerArguments.locationEnabled={cf['location']} \
                -Pandroid.testInstrumentationRunnerArguments.wifiEnabled={cf['wifi']} \
                -Pandroid.testInstrumentationRunnerArguments.mobileDataEnabled={cf['mobiledata']} \
                -Pandroid.testInstrumentationRunnerArguments.bluetoothEnabled={cf['bluetooth']} \
                -Pandroid.testInstrumentationRunnerArguments.batterySaverEnabled={cf['batterysaver']} \
                -Pandroid.testInstrumentationRunnerArguments.autoRotateEnabled={cf['autorotate']} \
                -Pandroid.testInstrumentationRunnerArguments.doNotDisturbEnabled={cf['donotdisturb']} \
                -Pandroid.testInstrumentationRunnerArguments.cameraEnabled={cf['camera']} \
                -Pandroid.testInstrumentationRunnerArguments.accelerometerEnabled={cf['accelerometer']} \
                -Pandroid.testInstrumentationRunnerArguments.gyroscopeEnabled={cf['gyroscope']} \
                -Pandroid.testInstrumentationRunnerArguments.lightEnabled={cf['light']} \
                -Pandroid.testInstrumentationRunnerArguments.magneticFieldEnabled={cf['magneticfield']} \
                -Pandroid.testInstrumentationRunnerArguments.orientationEnabled={cf['orientation']} \
                -Pandroid.testInstrumentationRunnerArguments.proximityEnabled={cf['proximity']} \
                    connectedDebugAndroidTest"
            print(check_output(command, shell=True).decode('cp850'))
            print()
            
            #Some devices require this adb command to allow the battery saver interaction
            command2 = f"adb shell dumpsys battery reset"
            print(check_output(command2, shell=True).decode('cp850'))
            print()    
  
            print(check_output(f"mkdir testReportsMult-MostEnabledDisabled/execution{currentExec}/report{k.replace('c','')}", shell="True").decode('cp850'))
            print()
            
            print(check_output(f"cp -Rf app/build/reports testReportsMult-MostEnabledDisabled/execution{currentExec}/report{k.replace('c','')}", shell="True").decode('cp850'))
            print()
            
            timeTakenConfig = perf_counter()-startTime_Config
            print(f"Time taken for the current config: {timeTakenConfig}") 
            execTimeFile.write(f"{k},{timeTakenConfig}")
            execTimeFile.write("\n")
            execTimeFile.flush()
            
            
        
        #print(keys)
        currentExec += 1

    #print(allConfig[keys[0]])
    execFile.close()
    execTimeFile.close()
