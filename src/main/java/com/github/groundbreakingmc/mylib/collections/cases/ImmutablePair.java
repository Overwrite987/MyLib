package com.github.groundbreakingmc.mylib.collections.cases;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ImmutablePair<L, R> {

    private final L left;
    private final R right;

    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        final ImmutablePair<?, ?> other = (ImmutablePair<?, ?>) object;
        return this.left.equals(other.left)
                && this.right.equals(other.right);
    }

    public ImmutablePair<L, R> clone() {
        return new ImmutablePair<>(this.left, this.right);
    }

    public static <L, R> ImmutablePair<L, R> of(L left, R right) {
        return new ImmutablePair<>(left, right);
    }

    @Override
    public int hashCode() {
        int result = 31 * 17 + (this.left == null ? 0 : this.left.hashCode());
        result = 31 * result + (this.right == null ? 0 : this.right.hashCode());
        return result;
    }
}
