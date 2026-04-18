package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.EuclideanRingOps
import com.alecdorrington.structures.ordered.OrderedEuclideanRing

/** Extension methods for [[OrderedEuclideanRing]]. */
trait OrderedEuclideanRingOps
  extends EuclideanRingOps, OrderedRingOps, OrderedEuclideanMonoidOps
