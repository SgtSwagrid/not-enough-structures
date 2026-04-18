package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.SemifieldOps
import com.alecdorrington.structures.ordered.OrderedSemifield

/** Extension methods for [[OrderedSemifield]]. */
trait OrderedSemifieldOps
  extends SemifieldOps, OrderedSemiringOps, OrderedMultiplicativeGroupOps
