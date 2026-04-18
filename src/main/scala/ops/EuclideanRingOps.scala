package com.alecdorrington.structures
package ops

import com.alecdorrington.structures.EuclideanRing

/** Extension methods for [[EuclideanRing]]. */
trait EuclideanRingOps extends RingOps, EuclideanMonoidOps:

  extension [X : EuclideanRing as X](x: X)

    /** Computes the signed remainder between both operands. */
    inline infix def % (y: X): X = X.mod(x, y)
