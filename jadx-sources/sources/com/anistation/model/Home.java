package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.ds;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mj5;
import defpackage.q71;
import defpackage.rb3;
import defpackage.v0;
import defpackage.vj1;
import defpackage.x73;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Home {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<Anime> popular;
    private final List<Recent> recent;
    private final List<Anime> top10;
    private final List<Anime> trending;

    static {
        vj1 vj1Var = new vj1((byte) 26);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{bx7.B(jf3Var, vj1Var), bx7.B(jf3Var, new vj1((byte) 27)), bx7.B(jf3Var, new vj1((byte) 28)), bx7.B(jf3Var, new vj1((byte) 29))};
    }

    public /* synthetic */ Home(int i, List list, List list2, List list3, List list4, kj5 kj5Var) {
        if (15 != (i & 15)) {
            iq4.throwMissingFieldException(i, 15, Home$$serializer.INSTANCE.getDescriptor());
        }
        this.recent = list;
        this.trending = list2;
        this.popular = list3;
        this.top10 = list4;
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_() {
        return new ds(Recent$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return new ds(Anime$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$1() {
        return new ds(Anime$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$2() {
        return new ds(Anime$$serializer.INSTANCE, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Home copy$default(Home home, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = home.recent;
        }
        if ((i & 2) != 0) {
            list2 = home.trending;
        }
        if ((i & 4) != 0) {
            list3 = home.popular;
        }
        if ((i & 8) != 0) {
            list4 = home.top10;
        }
        return home.copy(list, list2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Home home, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        v0 v0Var = (v0) hu0Var;
        v0Var.v(aj5Var, 0, (mj5) rb3VarArr[0].getValue(), home.recent);
        v0Var.v(aj5Var, 1, (mj5) rb3VarArr[1].getValue(), home.trending);
        v0Var.v(aj5Var, 2, (mj5) rb3VarArr[2].getValue(), home.popular);
        v0Var.v(aj5Var, 3, (mj5) rb3VarArr[3].getValue(), home.top10);
    }

    public final List<Recent> component1() {
        return this.recent;
    }

    public final List<Anime> component2() {
        return this.trending;
    }

    public final List<Anime> component3() {
        return this.popular;
    }

    public final List<Anime> component4() {
        return this.top10;
    }

    public final Home copy(List<Recent> list, List<Anime> list2, List<Anime> list3, List<Anime> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new Home(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Home)) {
            return false;
        }
        Home home = (Home) obj;
        if (a34.i(this.recent, home.recent) && a34.i(this.trending, home.trending) && a34.i(this.popular, home.popular) && a34.i(this.top10, home.top10)) {
            return true;
        }
        return false;
    }

    public final List<Anime> getPopular() {
        return this.popular;
    }

    public final List<Recent> getRecent() {
        return this.recent;
    }

    public final List<Anime> getTop10() {
        return this.top10;
    }

    public final List<Anime> getTrending() {
        return this.trending;
    }

    public int hashCode() {
        return this.top10.hashCode() + zo5.j(this.popular, zo5.j(this.trending, this.recent.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "Home(recent=" + this.recent + ", trending=" + this.trending + ", popular=" + this.popular + ", top10=" + this.top10 + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Home$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Home(List<Recent> list, List<Anime> list2, List<Anime> list3, List<Anime> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.recent = list;
        this.trending = list2;
        this.popular = list3;
        this.top10 = list4;
    }
}
