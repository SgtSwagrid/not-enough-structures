package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.EuclideanMonoidOps
import com.alecdorrington.structures.ordered.OrderedEuclideanMonoid

/** Extension methods for [[OrderedEuclideanMonoid]]. */
trait OrderedEuclideanMonoidOps
  extends EuclideanMonoidOps, OrderedMultiplicativeMonoidOps
