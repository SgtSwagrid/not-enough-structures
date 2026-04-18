package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.DifferenceSemiringOps
import com.alecdorrington.structures.ordered.OrderedDifferenceSemiring

/** Extension methods for [[OrderedDifferenceSemiring]]. */
trait OrderedDifferenceSemiringOps
  extends DifferenceSemiringOps, OrderedSemiringOps, OrderedDifferenceMonoidOps
