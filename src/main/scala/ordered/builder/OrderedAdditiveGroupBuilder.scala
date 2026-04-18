package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedAdditiveGroup
import com.alecdorrington.structures.ordered.OrderedAdditiveGroup

/** Methods for constructing [[OrderedAdditiveGroup]] type classes. */
trait OrderedAdditiveGroupBuilder
  extends OrderedRingBuilder, TupleIsOrderedAdditiveGroup
