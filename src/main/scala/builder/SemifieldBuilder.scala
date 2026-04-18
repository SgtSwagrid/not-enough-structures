package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.Semifield
import com.alecdorrington.structures.evidence.function.FunctionIsSemifield
import com.alecdorrington.structures.evidence.future.FutureIsSemifield
import com.alecdorrington.structures.evidence.tuple.TupleIsSemifield
import com.alecdorrington.structures.ordered.builder.OrderedSemifieldBuilder

/** Methods for constructing [[Semifield]] type classes. */
trait SemifieldBuilder
  extends OrderedSemifieldBuilder,
          FieldBuilder,
          TupleIsSemifield,
          FutureIsSemifield,
          FunctionIsSemifield
