def chab(s: String): Boolean =
  "<0(x|X)([0-9]|[a-f]|[A-F])+>".r.unanchored.pattern.matcher(s).matches
