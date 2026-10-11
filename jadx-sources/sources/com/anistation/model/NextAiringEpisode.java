package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.ql3;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class NextAiringEpisode {
    public static final Companion Companion = new Companion(null);
    private final Long airingAt;
    private final Integer episodeNumber;
    private final Long timeUntilAiring;

    public /* synthetic */ NextAiringEpisode(int i, Integer num, Long l, Long l2, kj5 kj5Var) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, NextAiringEpisode$$serializer.INSTANCE.getDescriptor());
        }
        this.episodeNumber = num;
        this.airingAt = l;
        this.timeUntilAiring = l2;
    }

    public static /* synthetic */ NextAiringEpisode copy$default(NextAiringEpisode nextAiringEpisode, Integer num, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = nextAiringEpisode.episodeNumber;
        }
        if ((i & 2) != 0) {
            l = nextAiringEpisode.airingAt;
        }
        if ((i & 4) != 0) {
            l2 = nextAiringEpisode.timeUntilAiring;
        }
        return nextAiringEpisode.copy(num, l, l2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(NextAiringEpisode nextAiringEpisode, hu0 hu0Var, aj5 aj5Var) {
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, i13.a, nextAiringEpisode.episodeNumber);
        ql3 ql3Var = ql3.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 1, ql3Var, nextAiringEpisode.airingAt);
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, ql3Var, nextAiringEpisode.timeUntilAiring);
    }

    public final Integer component1() {
        return this.episodeNumber;
    }

    public final Long component2() {
        return this.airingAt;
    }

    public final Long component3() {
        return this.timeUntilAiring;
    }

    public final NextAiringEpisode copy(Integer num, Long l, Long l2) {
        return new NextAiringEpisode(num, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NextAiringEpisode)) {
            return false;
        }
        NextAiringEpisode nextAiringEpisode = (NextAiringEpisode) obj;
        if (a34.i(this.episodeNumber, nextAiringEpisode.episodeNumber) && a34.i(this.airingAt, nextAiringEpisode.airingAt) && a34.i(this.timeUntilAiring, nextAiringEpisode.timeUntilAiring)) {
            return true;
        }
        return false;
    }

    public final Long getAiringAt() {
        return this.airingAt;
    }

    public final Integer getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final Long getTimeUntilAiring() {
        return this.timeUntilAiring;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.episodeNumber;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Long l = this.airingAt;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l2 = this.timeUntilAiring;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "NextAiringEpisode(episodeNumber=" + this.episodeNumber + ", airingAt=" + this.airingAt + ", timeUntilAiring=" + this.timeUntilAiring + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return NextAiringEpisode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NextAiringEpisode(Integer num, Long l, Long l2) {
        this.episodeNumber = num;
        this.airingAt = l;
        this.timeUntilAiring = l2;
    }
}
