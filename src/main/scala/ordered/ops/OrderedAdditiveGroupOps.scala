package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.AdditiveGroupOps
import com.alecdorrington.structures.ordered.OrderedAdditiveGroup

/** Extension methods for [[OrderedAdditiveGroup]]. */
trait OrderedAdditiveGroupOps
  extends AdditiveGroupOps,
          OrderedDifferenceMonoidOps,
          OrderedAdditiveInverseOps
