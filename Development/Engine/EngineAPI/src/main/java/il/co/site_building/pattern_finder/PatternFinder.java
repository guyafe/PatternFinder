package il.co.site_building.pattern_finder;

import il.co.site_building.pattern_finder.data_structures.FoundPatternInfo;

import java.io.File;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Created by guy on 3/26/16.
 */
public interface PatternFinder {

  /**
   * Finds a pattern in a file.
   *
   * @param pattern A pattern to find.
   * @param file The file to look for the patterns inside.
   * @return A collection of {@link il.co.site_building.pattern_finder.data_structures.FoundPatternInfo} representing all
   * the patterns that were found in the file.
   */
  Collection<FoundPatternInfo> findPattern(String pattern, File file);

  /**
   * Finds a pattern in a file.
   *
   * @param pattern A pattern to find.
   * @param file The file to look for the patterns inside.
   * @param intermediateResultsCallback A callback for each found pattern.
   * @return A collection of {@link il.co.site_building.pattern_finder.data_structures.FoundPatternInfo} representing all
   * the patterns that were found in the file.
   */
  Collection<FoundPatternInfo> findPattern(String pattern,
                                           File file,
                                           Consumer<FoundPatternInfo> intermediateResultsCallback);

}
