package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class SearchSuggestion {
    public static final Companion Companion = new Companion(null);
    private final String id;
    private final String thumbnailImage;
    private final String title;

    public /* synthetic */ SearchSuggestion(int i, String str, String str2, String str3, kj5 kj5Var) {
        if (3 != (i & 3)) {
            iq4.throwMissingFieldException(i, 3, SearchSuggestion$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        if ((i & 4) == 0) {
            this.thumbnailImage = null;
        } else {
            this.thumbnailImage = str3;
        }
    }

    public static /* synthetic */ SearchSuggestion copy$default(SearchSuggestion searchSuggestion, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchSuggestion.id;
        }
        if ((i & 2) != 0) {
            str2 = searchSuggestion.title;
        }
        if ((i & 4) != 0) {
            str3 = searchSuggestion.thumbnailImage;
        }
        return searchSuggestion.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(SearchSuggestion searchSuggestion, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, searchSuggestion.id);
        v0Var.w(aj5Var, 1, searchSuggestion.title);
        if (v0Var.shouldEncodeElementDefault(aj5Var, 2) || searchSuggestion.thumbnailImage != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 2, mz5.a, searchSuggestion.thumbnailImage);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.thumbnailImage;
    }

    public final SearchSuggestion copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return new SearchSuggestion(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestion)) {
            return false;
        }
        SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
        if (a34.i(this.id, searchSuggestion.id) && a34.i(this.title, searchSuggestion.title) && a34.i(this.thumbnailImage, searchSuggestion.thumbnailImage)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getThumbnailImage() {
        return this.thumbnailImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int i = zo5.i(this.title, this.id.hashCode() * 31, 31);
        String str = this.thumbnailImage;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i + hashCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        return h11.k(h11.o("SearchSuggestion(id=", str, ", title=", str2, ", thumbnailImage="), this.thumbnailImage, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return SearchSuggestion$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SearchSuggestion(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.thumbnailImage = str3;
    }

    public /* synthetic */ SearchSuggestion(String str, String str2, String str3, int i, q71 q71Var) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
