package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedSemiring
import com.alecdorrington.structures.ordered.OrderedSemiring

/** Methods for constructing [[OrderedSemiring]] type classes. */
trait OrderedSemiringBuilder
  extends OrderedDifferenceSemiringBuilder,
          OrderedSemifieldBuilder,
          TupleIsOrderedSemiring
