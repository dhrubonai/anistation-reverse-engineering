.class public final Lcom/google/android/recaptcha/internal/zzad;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzad;->zza:Landroid/content/Context;

    return-void
.end method

.method public static final zza(Ljava/io/File;)[B
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/FileInputStream;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const-wide/32 v3, 0x7fffffff

    .line 16
    .line 17
    .line 18
    cmp-long v3, v1, v3

    .line 19
    .line 20
    const-string v4, "File "

    .line 21
    .line 22
    if-gtz v3, :cond_5

    .line 23
    .line 24
    long-to-int v1, v1

    .line 25
    :try_start_1
    new-array v2, v1, [B

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    move v5, v1

    .line 29
    move v6, v3

    .line 30
    :goto_0
    if-lez v5, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2, v6, v5}, Ljava/io/FileInputStream;->read([BII)I

    .line 33
    .line 34
    .line 35
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    if-ltz v7, :cond_0

    .line 37
    .line 38
    sub-int/2addr v5, v7

    .line 39
    add-int/2addr v6, v7

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v7, "copyOf(...)"

    .line 42
    .line 43
    if-lez v5, :cond_1

    .line 44
    .line 45
    :try_start_2
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2, v7}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->read()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    const/4 v6, -0x1

    .line 58
    if-ne v5, v6, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    new-instance v6, Lg7/a;

    .line 62
    .line 63
    invoke-direct {v6}, Lg7/a;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v5}, Ljava/io/OutputStream;->write(I)V

    .line 67
    .line 68
    .line 69
    const/16 v5, 0x2000

    .line 70
    .line 71
    new-array v5, v5, [B

    .line 72
    .line 73
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    :goto_1
    if-ltz v8, :cond_3

    .line 78
    .line 79
    invoke-virtual {v6, v5, v3, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    add-int/2addr v5, v1

    .line 92
    if-ltz v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {v6}, Lg7/a;->a()[B

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2, v7}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {p0, v1, v2, v3, v4}, Lx6/i;->h1([BI[BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    :goto_2
    const/4 p0, 0x0

    .line 113
    invoke-static {v0, p0}, Lr6/h0;->A(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :cond_4
    :try_start_3
    new-instance v1, Ljava/lang/OutOfMemoryError;

    .line 118
    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string p0, " is too big to fit in memory."

    .line 131
    .line 132
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {v1, p0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :cond_5
    new-instance v3, Ljava/lang/OutOfMemoryError;

    .line 144
    .line 145
    new-instance v5, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string p0, " is too big ("

    .line 154
    .line 155
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string p0, " bytes) to fit in memory."

    .line 162
    .line 163
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-direct {v3, p0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    :catchall_0
    move-exception p0

    .line 175
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 176
    :catchall_1
    move-exception v1

    .line 177
    invoke-static {v0, p0}, Lr6/h0;->A(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    throw v1
.end method

.method public static final zzb(Ljava/io/File;[B)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 15
    .line 16
    const-string p1, "Unable to delete existing encrypted file"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    const-string v0, "array"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/io/FileOutputStream;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-static {v0, p0}, Lr6/h0;->A(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    invoke-static {v0, p0}, Lr6/h0;->A(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method
