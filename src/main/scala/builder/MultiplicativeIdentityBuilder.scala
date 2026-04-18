package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.MultiplicativeIdentity
import com.alecdorrington.structures.evidence.function.FunctionIsMultiplicativeIdentity
import com.alecdorrington.structures.evidence.future.FutureIsMultiplicativeIdentity
import com.alecdorrington.structures.evidence.tuple.TupleIsMultiplicativeIdentity
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeIdentityBuilder

/** Methods for constructing [[MultiplicativeIdentity]] type classes. */
trait MultiplicativeIdentityBuilder
  extends OrderedMultiplicativeIdentityBuilder,
          MultiplicativeMonoidBuilder,
          TupleIsMultiplicativeIdentity,
          FutureIsMultiplicativeIdentity,
          FunctionIsMultiplicativeIdentity
