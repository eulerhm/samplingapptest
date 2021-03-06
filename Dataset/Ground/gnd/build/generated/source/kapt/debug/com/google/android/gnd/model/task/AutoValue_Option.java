package com.google.android.gnd.model.task;

// Generated by com.google.auto.value.processor.AutoValueProcessor
final class AutoValue_Option extends Option {

  private final String id;

  private final String code;

  private final String label;

  private AutoValue_Option(
      String id,
      String code,
      String label) {
    this.id = id;
    this.code = code;
    this.label = label;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public String getCode() {
    return code;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public String toString() {
    return "Option{"
        + "id=" + id + ", "
        + "code=" + code + ", "
        + "label=" + label
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Option) {
      Option that = (Option) o;
      return this.id.equals(that.getId())
          && this.code.equals(that.getCode())
          && this.label.equals(that.getLabel());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= id.hashCode();
    h$ *= 1000003;
    h$ ^= code.hashCode();
    h$ *= 1000003;
    h$ ^= label.hashCode();
    return h$;
  }

  private static final long serialVersionUID = 1L;

  static final class Builder extends Option.Builder {
    private String id;
    private String code;
    private String label;
    Builder() {
    }
    @Override
    public Option.Builder setId(String id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public Option.Builder setCode(String code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public Option.Builder setLabel(String label) {
      if (label == null) {
        throw new NullPointerException("Null label");
      }
      this.label = label;
      return this;
    }
    @Override
    public Option build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.code == null) {
        missing += " code";
      }
      if (this.label == null) {
        missing += " label";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Option(
          this.id,
          this.code,
          this.label);
    }
  }

}
