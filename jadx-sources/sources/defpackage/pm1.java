package defpackage;

import com.anistation.model.download.DownloadSettings;
import com.anistation.model.download.DownloadStorageUsage;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pm1 {
    public final List a;
    public final String b;
    public final boolean c;
    public final Set d;
    public final List e;
    public final DownloadSettings f;
    public final DownloadStorageUsage g;
    public final boolean h;

    public pm1(List list, String str, boolean z, Set set, List list2, DownloadSettings downloadSettings, DownloadStorageUsage downloadStorageUsage, boolean z2) {
        list.getClass();
        set.getClass();
        list2.getClass();
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = set;
        this.e = list2;
        this.f = downloadSettings;
        this.g = downloadStorageUsage;
        this.h = z2;
    }

    public static pm1 a(pm1 pm1Var, List list, String str, boolean z, Set set, List list2, DownloadSettings downloadSettings, DownloadStorageUsage downloadStorageUsage, boolean z2, int i) {
        DownloadStorageUsage downloadStorageUsage2;
        boolean z3;
        if ((i & 1) != 0) {
            list = pm1Var.a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            str = pm1Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = pm1Var.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            set = pm1Var.d;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            list2 = pm1Var.e;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            downloadSettings = pm1Var.f;
        }
        DownloadSettings downloadSettings2 = downloadSettings;
        if ((i & 64) != 0) {
            downloadStorageUsage2 = pm1Var.g;
        } else {
            downloadStorageUsage2 = downloadStorageUsage;
        }
        if ((i & 128) != 0) {
            z3 = pm1Var.h;
        } else {
            z3 = z2;
        }
        pm1Var.getClass();
        list3.getClass();
        set2.getClass();
        list4.getClass();
        downloadSettings2.getClass();
        downloadStorageUsage2.getClass();
        return new pm1(list3, str2, z4, set2, list4, downloadSettings2, downloadStorageUsage2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        if (a34.i(this.a, pm1Var.a) && a34.i(this.b, pm1Var.b) && this.c == pm1Var.c && a34.i(this.d, pm1Var.d) && a34.i(this.e, pm1Var.e) && a34.i(this.f, pm1Var.f) && a34.i(this.g, pm1Var.g) && this.h == pm1Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + zo5.j(this.e, (this.d.hashCode() + zo5.g((hashCode2 + hashCode) * 31, 31, this.c)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DownloadsUiState(groups=" + this.a + ", selectedAnimeId=" + this.b + ", isSelectionMode=" + this.c + ", selectedAnimeIds=" + this.d + ", watchProgressList=" + this.e + ", downloadSettings=" + this.f + ", storageUsage=" + this.g + ", isLoading=" + this.h + ")";
    }
}
