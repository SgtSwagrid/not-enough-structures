package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.AdditiveMonoidOps
import com.alecdorrington.structures.ordered.OrderedAdditiveMonoid

/** Extension methods for [[OrderedAdditiveMonoid]]. */
trait OrderedAdditiveMonoidOps
  extends AdditiveMonoidOps,
          OrderedAdditiveSemigroupOps,
          OrderedAdditiveIdentityOps
