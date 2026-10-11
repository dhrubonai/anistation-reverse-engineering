package com.discord.org.webrtc;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: com.discord.org.webrtc.Predicate.2
            @Override // com.discord.org.webrtc.Predicate
            public boolean test(T t) {
                if (Predicate.this.test(t) && predicate.test(t)) {
                    return true;
                }
                return false;
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: com.discord.org.webrtc.Predicate.3
            @Override // com.discord.org.webrtc.Predicate
            public boolean test(T t) {
                return !Predicate.this.test(t);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: com.discord.org.webrtc.Predicate.1
            @Override // com.discord.org.webrtc.Predicate
            public boolean test(T t) {
                if (!Predicate.this.test(t) && !predicate.test(t)) {
                    return false;
                }
                return true;
            }
        };
    }

    boolean test(T t);
}
