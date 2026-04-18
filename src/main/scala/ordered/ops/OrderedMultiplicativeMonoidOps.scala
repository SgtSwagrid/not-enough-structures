package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.MultiplicativeMonoidOps
import com.alecdorrington.structures.ordered.OrderedMultiplicativeMonoid

/** Extension methods for [[OrderedMultiplicativeMonoid]]. */
trait OrderedMultiplicativeMonoidOps
  extends MultiplicativeMonoidOps,
          OrderedMultiplicativeSemigroupOps,
          OrderedMultiplicativeIdentityOps
