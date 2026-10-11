package com.anistation.model.backup;

import defpackage.a34;
import defpackage.h11;
import defpackage.qx1;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class BackupResult {
    private final int animeCount;
    private final long createdAtEpochMillis;
    private final String displayPath;
    private final String fileName;
    private final int watchProgressCount;

    public BackupResult(String str, String str2, long j, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.fileName = str;
        this.displayPath = str2;
        this.createdAtEpochMillis = j;
        this.animeCount = i;
        this.watchProgressCount = i2;
    }

    public static /* synthetic */ BackupResult copy$default(BackupResult backupResult, String str, String str2, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = backupResult.fileName;
        }
        if ((i3 & 2) != 0) {
            str2 = backupResult.displayPath;
        }
        if ((i3 & 4) != 0) {
            j = backupResult.createdAtEpochMillis;
        }
        if ((i3 & 8) != 0) {
            i = backupResult.animeCount;
        }
        if ((i3 & 16) != 0) {
            i2 = backupResult.watchProgressCount;
        }
        long j2 = j;
        return backupResult.copy(str, str2, j2, i, i2);
    }

    public final String component1() {
        return this.fileName;
    }

    public final String component2() {
        return this.displayPath;
    }

    public final long component3() {
        return this.createdAtEpochMillis;
    }

    public final int component4() {
        return this.animeCount;
    }

    public final int component5() {
        return this.watchProgressCount;
    }

    public final BackupResult copy(String str, String str2, long j, int i, int i2) {
        str.getClass();
        str2.getClass();
        return new BackupResult(str, str2, j, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackupResult)) {
            return false;
        }
        BackupResult backupResult = (BackupResult) obj;
        if (a34.i(this.fileName, backupResult.fileName) && a34.i(this.displayPath, backupResult.displayPath) && this.createdAtEpochMillis == backupResult.createdAtEpochMillis && this.animeCount == backupResult.animeCount && this.watchProgressCount == backupResult.watchProgressCount) {
            return true;
        }
        return false;
    }

    public final int getAnimeCount() {
        return this.animeCount;
    }

    public final long getCreatedAtEpochMillis() {
        return this.createdAtEpochMillis;
    }

    public final String getDisplayPath() {
        return this.displayPath;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getWatchProgressCount() {
        return this.watchProgressCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.watchProgressCount) + qx1.c(this.animeCount, qx1.d(zo5.i(this.displayPath, this.fileName.hashCode() * 31, 31), this.createdAtEpochMillis, 31), 31);
    }

    public String toString() {
        String str = this.fileName;
        String str2 = this.displayPath;
        long j = this.createdAtEpochMillis;
        int i = this.animeCount;
        int i2 = this.watchProgressCount;
        StringBuilder o = h11.o("BackupResult(fileName=", str, ", displayPath=", str2, ", createdAtEpochMillis=");
        o.append(j);
        o.append(", animeCount=");
        o.append(i);
        o.append(", watchProgressCount=");
        o.append(i2);
        o.append(")");
        return o.toString();
    }
}
