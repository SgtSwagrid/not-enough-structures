package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedAdditiveIdentity
import com.alecdorrington.structures.ordered.OrderedAdditiveIdentity

/** Methods for constructing [[OrderedAdditiveIdentity]] type classes. */
trait OrderedAdditiveIdentityBuilder
  extends OrderedAdditiveMonoidBuilder, TupleIsOrderedAdditiveIdentity
