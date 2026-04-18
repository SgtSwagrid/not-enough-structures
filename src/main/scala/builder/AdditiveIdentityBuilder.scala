package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.AdditiveIdentity
import com.alecdorrington.structures.evidence.function.FunctionIsAdditiveIdentity
import com.alecdorrington.structures.evidence.future.FutureIsAdditiveIdentity
import com.alecdorrington.structures.evidence.tuple.TupleIsAdditiveIdentity
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveIdentityBuilder

/** Methods for constructing [[AdditiveIdentity]] type classes. */
trait AdditiveIdentityBuilder
  extends OrderedAdditiveIdentityBuilder,
          AdditiveMonoidBuilder,
          TupleIsAdditiveIdentity,
          FutureIsAdditiveIdentity,
          FunctionIsAdditiveIdentity
