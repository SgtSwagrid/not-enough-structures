package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.MultiplicativeSemigroup
import com.alecdorrington.structures.evidence.function.FunctionIsMultiplicativeSemigroup
import com.alecdorrington.structures.evidence.future.FutureIsMultiplicativeSemigroup
import com.alecdorrington.structures.evidence.tuple.TupleIsMultiplicativeSemigroup
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeSemigroupBuilder

/** Methods for constructing [[MultiplicativeSemigroup]] type classes. */
trait MultiplicativeSemigroupBuilder
  extends OrderedMultiplicativeSemigroupBuilder,
          MultiplicativeMonoidBuilder,
          TupleIsMultiplicativeSemigroup,
          FutureIsMultiplicativeSemigroup,
          FunctionIsMultiplicativeSemigroup
