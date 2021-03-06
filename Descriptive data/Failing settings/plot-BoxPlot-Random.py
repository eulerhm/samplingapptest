import pandas as pd
import matplotlib.pyplot as plt

my_data = pd.Series([2, 4, 4, 2, 4, 2, 3, 1, 3, 1, 3, 4, 3, 3, 2, 1, 2, 1, 1, 1, 4, 1, 7, 1, 3, 4, 3, 5, 5, 1, 2, 4, 2, 2, 1, 1, 2, 1, 2, 4, 1, 4, 2, 4, 2, 1, 3, 1, 4, 4, 1, 2, 7, 1, 2, 4, 4, 4, 3, 2, 10, 1, 1, 2, 2, 4, 1, 2, 3, 3, 3, 2, 4, 6, 3, 4, 4, 1, 4, 2, 1, 1, 4, 3, 4, 1, 1, 4, 3, 7, 1, 2, 4, 4, 1, 1, 1, 1, 2, 1, 2, 4, 3, 10, 1, 2, 1, 3, 1, 2, 4, 1, 2, 1, 3, 1, 1, 4, 10, 1, 1, 4, 1, 4, 1, 2, 1, 4, 1, 2, 5, 4, 2, 4, 1, 3, 1, 7, 4, 3, 4, 10, 10, 4, 10, 2, 2, 4, 2, 7, 6, 3, 2, 4, 4, 2, 2, 4, 1, 4, 2, 4])
my_data.plot(kind = 'box', title = 'Random', ylabel = 'Failures', use_index = False)
plt.show()
