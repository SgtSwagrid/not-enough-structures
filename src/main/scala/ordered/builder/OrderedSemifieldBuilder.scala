package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedSemifield
import com.alecdorrington.structures.ordered.OrderedSemifield

/** Methods for constructing [[OrderedSemifield]] type classes. */
trait OrderedSemifieldBuilder
  extends OrderedFieldBuilder, TupleIsOrderedSemifield
