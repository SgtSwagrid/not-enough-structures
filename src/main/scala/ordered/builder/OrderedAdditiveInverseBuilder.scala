package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedAdditiveInverse
import com.alecdorrington.structures.ordered.OrderedAdditiveInverse

/** Methods for constructing [[OrderedAdditiveInverse]] type classes. */
trait OrderedAdditiveInverseBuilder
  extends OrderedAdditiveGroupBuilder, TupleIsOrderedAdditiveInverse
