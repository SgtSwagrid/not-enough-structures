package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.MultiplicativeGroupOps
import com.alecdorrington.structures.ordered.OrderedMultiplicativeGroup

/** Extension methods for [[OrderedMultiplicativeGroup]]. */
trait OrderedMultiplicativeGroupOps
  extends MultiplicativeGroupOps,
          OrderedEuclideanMonoidOps,
          OrderedMultiplicativeInverseOps
