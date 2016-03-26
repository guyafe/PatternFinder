package il.co.site_building.pattern_finder.data_structures;

/**
 * This class represents meta-data about a found patterm.
 * Created by guy on 3/26/16.
 */
public class FoundPatternInfo {

  private final String pattern;
  private final long index;

  public FoundPatternInfo(String pattern, long start) {
    this.pattern = pattern;
    this.index = start;
  }

  /**
   * Getter for the pattern.
   * @return The pattern that was looked for.
   */
  public String getPattern() {
    return pattern;
  }

  /**
   * Getter for the index.
   * @return The index in which the pattern appears.
   */
  public long getIndex() {
    return index;
  }


  @SuppressWarnings("SimplifiableIfStatement") @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    FoundPatternInfo that = (FoundPatternInfo) o;

    if (index != that.index) return false;
    return pattern != null ? pattern.equals(that.pattern) : that.pattern == null;

  }

  @Override
  public int hashCode() {
    int result = pattern != null ? pattern.hashCode() : 0;
    result = 31 * result + (int) (index ^ (index >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "FoundPatternInfo{" +
           "pattern='" + pattern + '\'' +
           ", index=" + index +
           '}';
  }
}
