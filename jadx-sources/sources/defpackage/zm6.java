package defpackage;

import com.anistation.model.Resource;
import com.anistation.model.library.AnimeListItem;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zm6 {
    public final Resource a;
    public final Resource b;
    public final String c;
    public final Integer d;
    public final List e;
    public final AnimeListItem f;
    public final boolean g;

    public zm6(Resource resource, Resource resource2, String str, Integer num, List list, AnimeListItem animeListItem, boolean z) {
        resource.getClass();
        resource2.getClass();
        list.getClass();
        this.a = resource;
        this.b = resource2;
        this.c = str;
        this.d = num;
        this.e = list;
        this.f = animeListItem;
        this.g = z;
    }

    public static zm6 a(zm6 zm6Var, Resource resource, Resource resource2, String str, Integer num, List list, AnimeListItem animeListItem, boolean z, int i) {
        if ((i & 1) != 0) {
            resource = zm6Var.a;
        }
        Resource resource3 = resource;
        if ((i & 2) != 0) {
            resource2 = zm6Var.b;
        }
        Resource resource4 = resource2;
        if ((i & 4) != 0) {
            str = zm6Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            num = zm6Var.d;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            list = zm6Var.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            animeListItem = zm6Var.f;
        }
        AnimeListItem animeListItem2 = animeListItem;
        if ((i & 64) != 0) {
            z = zm6Var.g;
        }
        zm6Var.getClass();
        resource3.getClass();
        resource4.getClass();
        list2.getClass();
        return new zm6(resource3, resource4, str2, num2, list2, animeListItem2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm6)) {
            return false;
        }
        zm6 zm6Var = (zm6) obj;
        if (a34.i(this.a, zm6Var.a) && a34.i(this.b, zm6Var.b) && a34.i(this.c, zm6Var.c) && a34.i(this.d, zm6Var.d) && a34.i(this.e, zm6Var.e) && a34.i(this.f, zm6Var.f) && this.g == zm6Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int j = zo5.j(this.e, (i2 + hashCode2) * 31, 31);
        AnimeListItem animeListItem = this.f;
        if (animeListItem != null) {
            i = animeListItem.hashCode();
        }
        return Boolean.hashCode(this.g) + ((j + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(info=");
        sb.append(this.a);
        sb.append(", episodes=");
        sb.append(this.b);
        sb.append(", currentEpisodeTitle=");
        sb.append(this.c);
        sb.append(", currentEpisodeNumber=");
        sb.append(this.d);
        sb.append(", watchProgressList=");
        sb.append(this.e);
        sb.append(", animeListItem=");
        sb.append(this.f);
        sb.append(", isSavedToList=");
        return qx1.r(sb, this.g, ")");
    }
}
