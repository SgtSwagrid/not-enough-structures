package com.alecdorrington.structures
package ops

import com.alecdorrington.structures.MultiplicativeMonoid

/** Extension methods for [[MultiplicativeMonoid]]. */
trait MultiplicativeMonoidOps
  extends MultiplicativeSemigroupOps, MultiplicativeIdentityOps:

  extension [X : MultiplicativeMonoid as X](x: X)

    /**
      * Computes this value raised to the power [[n]], for any non-negative
      * [[n]].
      */
    inline infix def pow(n: Int): X = X.pow(x, n)
