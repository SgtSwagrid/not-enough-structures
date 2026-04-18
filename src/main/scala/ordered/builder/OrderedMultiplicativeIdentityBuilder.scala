package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedMultiplicativeIdentity
import com.alecdorrington.structures.ordered.OrderedMultiplicativeIdentity

/** Methods for constructing [[OrderedMultiplicativeIdentity]] type classes. */
trait OrderedMultiplicativeIdentityBuilder
  extends OrderedMultiplicativeMonoidBuilder,
          TupleIsOrderedMultiplicativeIdentity
