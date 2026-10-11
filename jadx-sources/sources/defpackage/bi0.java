package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bi0 {
    public final String a;
    public final ar3 b;
    public final Map c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Map g;
    public volatile String h;

    public bi0(String str, ar3 ar3Var, Map map) {
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        newKeySet.getClass();
        ConcurrentHashMap.KeySetView newKeySet2 = ConcurrentHashMap.newKeySet();
        newKeySet2.getClass();
        ConcurrentHashMap.KeySetView newKeySet3 = ConcurrentHashMap.newKeySet();
        newKeySet3.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = str;
        this.b = ar3Var;
        this.c = map;
        this.d = newKeySet;
        this.e = newKeySet2;
        this.f = newKeySet3;
        this.g = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bi0) {
                bi0 bi0Var = (bi0) obj;
                if (!this.a.equals(bi0Var.a) || !this.b.equals(bi0Var.b) || !this.c.equals(bi0Var.c) || !this.d.equals(bi0Var.d) || !this.e.equals(bi0Var.e) || !this.f.equals(bi0Var.f) || !this.g.equals(bi0Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RelaySource(token=" + this.a + ", mediaItem=" + this.b + ", headers=" + this.c + ", allowedUrls=" + this.d + ", hlsResources=" + this.e + ", transportStreamResources=" + this.f + ", convertedSubtitleResources=" + this.g + ")";
    }
}
