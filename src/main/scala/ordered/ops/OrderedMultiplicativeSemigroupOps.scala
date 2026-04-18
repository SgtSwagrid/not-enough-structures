package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.MultiplicativeSemigroupOps
import com.alecdorrington.structures.ordered.OrderedMultiplicativeSemigroup

/** Extension methods for [[OrderedMultiplicativeSemigroup]]. */
trait OrderedMultiplicativeSemigroupOps
  extends MultiplicativeSemigroupOps, OrderingOps
