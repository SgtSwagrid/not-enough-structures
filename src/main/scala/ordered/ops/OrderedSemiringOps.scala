package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.SemiringOps
import com.alecdorrington.structures.ordered.OrderedSemiring

/** Extension methods for [[OrderedSemiring]]. */
trait OrderedSemiringOps
  extends SemiringOps, OrderedAdditiveMonoidOps, OrderedMultiplicativeMonoidOps
