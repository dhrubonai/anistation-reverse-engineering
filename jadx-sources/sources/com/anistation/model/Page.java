package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.ds;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.kq4;
import defpackage.q71;
import defpackage.qx1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Page<T> {
    private static final aj5 $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final int currentPage;
    private final boolean hasNextPage;
    private final int perPage;
    private final List<T> results;
    private final Integer total;

    static {
        kq4 kq4Var = new kq4("com.anistation.model.Page", null, 5);
        kq4Var.j("currentPage", false);
        kq4Var.j("perPage", false);
        kq4Var.j("hasNextPage", false);
        kq4Var.j("total", false);
        kq4Var.j("results", false);
        $cachedDescriptor = kq4Var;
    }

    public /* synthetic */ Page(int i, int i2, int i3, boolean z, Integer num, List list, kj5 kj5Var) {
        if (31 != (i & 31)) {
            iq4.throwMissingFieldException(i, 31, $cachedDescriptor);
        }
        this.currentPage = i2;
        this.perPage = i3;
        this.hasNextPage = z;
        this.total = num;
        this.results = list;
    }

    public static /* synthetic */ Page copy$default(Page page, int i, int i2, boolean z, Integer num, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = page.currentPage;
        }
        if ((i3 & 2) != 0) {
            i2 = page.perPage;
        }
        if ((i3 & 4) != 0) {
            z = page.hasNextPage;
        }
        if ((i3 & 8) != 0) {
            num = page.total;
        }
        if ((i3 & 16) != 0) {
            list = page.results;
        }
        List list2 = list;
        boolean z2 = z;
        return page.copy(i, i2, z2, num, list2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Page page, hu0 hu0Var, aj5 aj5Var, x73 x73Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.t(0, page.currentPage, aj5Var);
        v0Var.t(1, page.perPage, aj5Var);
        v0Var.p(aj5Var, 2, page.hasNextPage);
        v0Var.encodeNullableSerializableElement(aj5Var, 3, i13.a, page.total);
        v0Var.v(aj5Var, 4, new ds(x73Var, (byte) 0), page.results);
    }

    public final int component1() {
        return this.currentPage;
    }

    public final int component2() {
        return this.perPage;
    }

    public final boolean component3() {
        return this.hasNextPage;
    }

    public final Integer component4() {
        return this.total;
    }

    public final List<T> component5() {
        return this.results;
    }

    public final Page<T> copy(int i, int i2, boolean z, Integer num, List<? extends T> list) {
        list.getClass();
        return new Page<>(i, i2, z, num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Page)) {
            return false;
        }
        Page page = (Page) obj;
        if (this.currentPage == page.currentPage && this.perPage == page.perPage && this.hasNextPage == page.hasNextPage && a34.i(this.total, page.total) && a34.i(this.results, page.results)) {
            return true;
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final int getPerPage() {
        return this.perPage;
    }

    public final List<T> getResults() {
        return this.results;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode;
        int g = zo5.g(qx1.c(this.perPage, Integer.hashCode(this.currentPage) * 31, 31), 31, this.hasNextPage);
        Integer num = this.total;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.results.hashCode() + ((g + hashCode) * 31);
    }

    public String toString() {
        int i = this.currentPage;
        int i2 = this.perPage;
        boolean z = this.hasNextPage;
        Integer num = this.total;
        List<T> list = this.results;
        StringBuilder u = qx1.u("Page(currentPage=", i, ", perPage=", i2, ", hasNextPage=");
        u.append(z);
        u.append(", total=");
        u.append(num);
        u.append(", results=");
        u.append(list);
        u.append(")");
        return u.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final <T> x73 serializer(x73 x73Var) {
            x73Var.getClass();
            return new Page$$serializer(x73Var);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Page(int i, int i2, boolean z, Integer num, List<? extends T> list) {
        list.getClass();
        this.currentPage = i;
        this.perPage = i2;
        this.hasNextPage = z;
        this.total = num;
        this.results = list;
    }
}
