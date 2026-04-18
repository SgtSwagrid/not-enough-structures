package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.AdditiveSemigroup
import com.alecdorrington.structures.evidence.function.FunctionIsAdditiveSemigroup
import com.alecdorrington.structures.evidence.future.FutureIsAdditiveSemigroup
import com.alecdorrington.structures.evidence.tuple.TupleIsAdditiveSemigroup
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveSemigroupBuilder

/** Methods for constructing [[AdditiveSemigroup]] type classes. */
trait AdditiveSemigroupBuilder
  extends OrderedAdditiveSemigroupBuilder,
          AdditiveMonoidBuilder,
          TupleIsAdditiveSemigroup,
          FutureIsAdditiveSemigroup,
          FunctionIsAdditiveSemigroup
