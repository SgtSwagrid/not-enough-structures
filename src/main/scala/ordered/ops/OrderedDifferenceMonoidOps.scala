package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.DifferenceMonoidOps
import com.alecdorrington.structures.ordered.OrderedDifferenceMonoid

/** Extension methods for [[OrderedDifferenceMonoid]]. */
trait OrderedDifferenceMonoidOps
  extends DifferenceMonoidOps, OrderedAdditiveMonoidOps
