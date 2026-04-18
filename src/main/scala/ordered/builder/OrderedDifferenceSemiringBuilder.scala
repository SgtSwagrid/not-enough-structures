package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedDifferenceSemiring
import com.alecdorrington.structures.ordered.OrderedDifferenceSemiring

/** Methods for constructing [[OrderedDifferenceSemiring]] type classes. */
trait OrderedDifferenceSemiringBuilder
  extends OrderedRingBuilder, TupleIsOrderedDifferenceSemiring
