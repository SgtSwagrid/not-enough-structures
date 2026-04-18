package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedMultiplicativeGroup
import com.alecdorrington.structures.ordered.OrderedMultiplicativeGroup

/** Methods for constructing [[OrderedMultiplicativeGroup]] type classes. */
trait OrderedMultiplicativeGroupBuilder
  extends OrderedSemifieldBuilder, TupleIsOrderedMultiplicativeGroup
