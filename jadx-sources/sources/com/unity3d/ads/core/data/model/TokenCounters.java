package com.unity3d.ads.core.data.model;

import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class TokenCounters {
    private int seq;
    private int starts;
    private int wins;

    public TokenCounters(int i, int i2, int i3) {
        this.seq = i;
        this.wins = i2;
        this.starts = i3;
    }

    public static /* synthetic */ TokenCounters copy$default(TokenCounters tokenCounters, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tokenCounters.seq;
        }
        if ((i4 & 2) != 0) {
            i2 = tokenCounters.wins;
        }
        if ((i4 & 4) != 0) {
            i3 = tokenCounters.starts;
        }
        return tokenCounters.copy(i, i2, i3);
    }

    public final int component1() {
        return this.seq;
    }

    public final int component2() {
        return this.wins;
    }

    public final int component3() {
        return this.starts;
    }

    public final TokenCounters copy(int i, int i2, int i3) {
        return new TokenCounters(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCounters)) {
            return false;
        }
        TokenCounters tokenCounters = (TokenCounters) obj;
        if (this.seq == tokenCounters.seq && this.wins == tokenCounters.wins && this.starts == tokenCounters.starts) {
            return true;
        }
        return false;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final int getStarts() {
        return this.starts;
    }

    public final int getWins() {
        return this.wins;
    }

    public int hashCode() {
        return Integer.hashCode(this.starts) + qx1.c(this.wins, Integer.hashCode(this.seq) * 31, 31);
    }

    public final void setSeq(int i) {
        this.seq = i;
    }

    public final void setStarts(int i) {
        this.starts = i;
    }

    public final void setWins(int i) {
        this.wins = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TokenCounters(seq=");
        sb.append(this.seq);
        sb.append(", wins=");
        sb.append(this.wins);
        sb.append(", starts=");
        return qx1.o(sb, this.starts, ')');
    }
}
