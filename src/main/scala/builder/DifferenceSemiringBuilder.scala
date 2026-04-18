package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.DifferenceSemiring
import com.alecdorrington.structures.evidence.function.FunctionIsDifferenceSemiring
import com.alecdorrington.structures.evidence.future.FutureIsDifferenceSemiring
import com.alecdorrington.structures.evidence.tuple.TupleIsDifferenceSemiring
import com.alecdorrington.structures.ordered.builder.OrderedDifferenceSemiringBuilder

/** Methods for constructing [[DifferenceSemiring]] type classes. */
trait DifferenceSemiringBuilder
  extends OrderedDifferenceSemiringBuilder,
          RingBuilder,
          TupleIsDifferenceSemiring,
          FutureIsDifferenceSemiring,
          FunctionIsDifferenceSemiring
