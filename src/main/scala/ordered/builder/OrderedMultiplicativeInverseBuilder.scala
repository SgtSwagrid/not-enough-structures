package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedMultiplicativeInverse
import com.alecdorrington.structures.ordered.OrderedMultiplicativeInverse

/** Methods for constructing [[OrderedMultiplicativeInverse]] type classes. */
trait OrderedMultiplicativeInverseBuilder
  extends OrderedMultiplicativeGroupBuilder, TupleIsOrderedMultiplicativeInverse
