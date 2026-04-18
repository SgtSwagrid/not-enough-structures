package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedDifferenceMonoid
import com.alecdorrington.structures.ordered.OrderedDifferenceMonoid

/** Methods for constructing [[OrderedDifferenceMonoid]] type classes. */
trait OrderedDifferenceMonoidBuilder
  extends OrderedAdditiveGroupBuilder,
          OrderedDifferenceSemiringBuilder,
          TupleIsOrderedDifferenceMonoid
