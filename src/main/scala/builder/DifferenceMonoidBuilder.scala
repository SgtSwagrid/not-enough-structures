package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.DifferenceMonoid
import com.alecdorrington.structures.evidence.function.FunctionIsDifferenceMonoid
import com.alecdorrington.structures.evidence.future.FutureIsDifferenceMonoid
import com.alecdorrington.structures.evidence.tuple.TupleIsDifferenceMonoid
import com.alecdorrington.structures.ordered.builder.OrderedDifferenceMonoidBuilder

/** Methods for constructing [[DifferenceMonoid]] type classes. */
trait DifferenceMonoidBuilder
  extends OrderedDifferenceMonoidBuilder,
          AdditiveGroupBuilder,
          DifferenceSemiringBuilder,
          TupleIsDifferenceMonoid,
          FutureIsDifferenceMonoid,
          FunctionIsDifferenceMonoid
