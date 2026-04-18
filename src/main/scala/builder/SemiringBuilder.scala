package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.Semiring
import com.alecdorrington.structures.evidence.collection.OptionIsSemiring
import com.alecdorrington.structures.evidence.function.FunctionIsSemiring
import com.alecdorrington.structures.evidence.future.FutureIsSemiring
import com.alecdorrington.structures.evidence.tuple.TupleIsSemiring
import com.alecdorrington.structures.ordered.builder.OrderedSemiringBuilder

/** Methods for constructing [[Semiring]] type classes. */
trait SemiringBuilder
  extends OrderedSemiringBuilder,
          DifferenceSemiringBuilder,
          SemifieldBuilder,
          TupleIsSemiring,
          FutureIsSemiring,
          FunctionIsSemiring,
          OptionIsSemiring
