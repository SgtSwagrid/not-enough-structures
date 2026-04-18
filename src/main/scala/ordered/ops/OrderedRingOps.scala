package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.RingOps
import com.alecdorrington.structures.ordered.OrderedRing

/** Extension methods for [[OrderedRing]]. */
trait OrderedRingOps
  extends RingOps, OrderedAdditiveGroupOps, OrderedDifferenceSemiringOps
