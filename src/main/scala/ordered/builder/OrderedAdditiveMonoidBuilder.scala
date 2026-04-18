package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedAdditiveMonoid
import com.alecdorrington.structures.ordered.OrderedAdditiveMonoid

/** Methods for constructing [[OrderedAdditiveMonoid]] type classes. */
trait OrderedAdditiveMonoidBuilder
  extends OrderedDifferenceMonoidBuilder,
          OrderedSemiringBuilder,
          TupleIsOrderedAdditiveMonoid
