.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile y:Lcom/bumptech/glide/b;

.field public static volatile z:Z


# instance fields
.field public final a:Ly3/d;

.field public final b:Lz3/g;

.field public final c:Lcom/bumptech/glide/f;

.field public final d:Ly3/h;

.field public final e:Li4/n;

.field public final f:Lf9/x;

.field public final x:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx3/q;Lz3/g;Ly3/d;Ly3/h;Li4/n;Lf9/x;ILk3/d;Ln/e;Ljava/util/List;Ljava/util/ArrayList;Lr6/h0;Landroidx/lifecycle/b0;)V
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 11
    .line 12
    move-object/from16 v1, p4

    .line 13
    .line 14
    iput-object v1, v0, Lcom/bumptech/glide/b;->a:Ly3/d;

    .line 15
    .line 16
    move-object/from16 v3, p5

    .line 17
    .line 18
    iput-object v3, v0, Lcom/bumptech/glide/b;->d:Ly3/h;

    .line 19
    .line 20
    move-object/from16 v1, p3

    .line 21
    .line 22
    iput-object v1, v0, Lcom/bumptech/glide/b;->b:Lz3/g;

    .line 23
    .line 24
    move-object/from16 v1, p6

    .line 25
    .line 26
    iput-object v1, v0, Lcom/bumptech/glide/b;->e:Li4/n;

    .line 27
    .line 28
    move-object/from16 v1, p7

    .line 29
    .line 30
    iput-object v1, v0, Lcom/bumptech/glide/b;->f:Lf9/x;

    .line 31
    .line 32
    new-instance v4, Lo1/d0;

    .line 33
    .line 34
    move-object/from16 v2, p12

    .line 35
    .line 36
    move-object/from16 v1, p13

    .line 37
    .line 38
    invoke-direct {v4, p0, v2, v1}, Lo1/d0;-><init>(Lcom/bumptech/glide/b;Ljava/util/ArrayList;Lr6/h0;)V

    .line 39
    .line 40
    .line 41
    new-instance v5, Lf9/x;

    .line 42
    .line 43
    const/16 v1, 0x16

    .line 44
    .line 45
    invoke-direct {v5, v1}, Lf9/x;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance v12, Lcom/bumptech/glide/f;

    .line 49
    .line 50
    move-object v1, v12

    .line 51
    move-object v2, p1

    .line 52
    move-object/from16 v6, p9

    .line 53
    .line 54
    move-object/from16 v7, p10

    .line 55
    .line 56
    move-object/from16 v8, p11

    .line 57
    .line 58
    move-object v9, p2

    .line 59
    move-object/from16 v10, p14

    .line 60
    .line 61
    move/from16 v11, p8

    .line 62
    .line 63
    invoke-direct/range {v1 .. v11}, Lcom/bumptech/glide/f;-><init>(Landroid/content/Context;Ly3/h;Lo1/d0;Lf9/x;Lk3/d;Ln/e;Ljava/util/List;Lx3/q;Landroidx/lifecycle/b0;I)V

    .line 64
    .line 65
    .line 66
    iput-object v12, v0, Lcom/bumptech/glide/b;->c:Lcom/bumptech/glide/f;

    .line 67
    .line 68
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 6

    .line 1
    sget-object v0, Lcom/bumptech/glide/b;->y:Lcom/bumptech/glide/b;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    :try_start_0
    const-string v3, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 12
    .line 13
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    new-array v4, v2, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v5, Landroid/content/Context;

    .line 20
    .line 21
    aput-object v5, v4, v1

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-array v4, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    aput-object v0, v4, v1

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :catch_2
    move-exception p0

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :catch_3
    move-exception p0

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 73
    .line 74
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :catch_4
    const-string v0, "Glide"

    .line 79
    .line 80
    const/4 v3, 0x5

    .line 81
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_0

    .line 86
    .line 87
    const-string v3, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 88
    .line 89
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_0
    const/4 v0, 0x0

    .line 93
    :goto_0
    const-class v3, Lcom/bumptech/glide/b;

    .line 94
    .line 95
    monitor-enter v3

    .line 96
    :try_start_1
    sget-object v4, Lcom/bumptech/glide/b;->y:Lcom/bumptech/glide/b;

    .line 97
    .line 98
    if-nez v4, :cond_2

    .line 99
    .line 100
    sget-boolean v4, Lcom/bumptech/glide/b;->z:Z

    .line 101
    .line 102
    if-nez v4, :cond_1

    .line 103
    .line 104
    sput-boolean v2, Lcom/bumptech/glide/b;->z:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    :try_start_2
    invoke-static {p0, v0}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    .line 109
    :try_start_3
    sput-boolean v1, Lcom/bumptech/glide/b;->z:Z

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    sput-boolean v1, Lcom/bumptech/glide/b;->z:Z

    .line 114
    .line 115
    throw p0

    .line 116
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "Glide has been called recursively, this is probably an internal library error!"

    .line 119
    .line 120
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_2
    :goto_1
    monitor-exit v3

    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    throw p0

    .line 129
    :cond_3
    :goto_2
    sget-object p0, Lcom/bumptech/glide/b;->y:Lcom/bumptech/glide/b;

    .line 130
    .line 131
    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 24

    .line 1
    new-instance v1, Lcom/bumptech/glide/e;

    .line 2
    .line 3
    invoke-direct {v1}, Lcom/bumptech/glide/e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v15

    .line 10
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    const-string v0, "Got app info metadata: "

    .line 14
    .line 15
    const-string v2, "ManifestParser"

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    const-string v4, "Loading Glide modules"

    .line 25
    .line 26
    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    new-instance v14, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x0

    .line 36
    :try_start_0
    invoke-virtual {v15}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const/16 v8, 0x80

    .line 45
    .line 46
    invoke-virtual {v6, v7, v8}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    if-eqz v6, :cond_5

    .line 51
    .line 52
    iget-object v7, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 53
    .line 54
    if-nez v7, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_2

    .line 62
    .line 63
    new-instance v7, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object v0, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_4

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    check-cast v7, Ljava/lang/String;

    .line 101
    .line 102
    const-string v8, "GlideModule"

    .line 103
    .line 104
    iget-object v9, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 105
    .line 106
    invoke-virtual {v9, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-nez v8, :cond_3

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    invoke-static {v7}, Lb5/h;->d(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v5

    .line 121
    :catch_0
    move-exception v0

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    const-string v0, "Finished loading Glide modules"

    .line 130
    .line 131
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    :goto_1
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    const-string v0, "Got null app info metadata"

    .line 142
    .line 143
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :goto_2
    const/4 v6, 0x6

    .line 148
    invoke-static {v2, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_6

    .line 153
    .line 154
    const-string v6, "Failed to parse glide modules"

    .line 155
    .line 156
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 157
    .line 158
    .line 159
    :cond_6
    :goto_3
    if-eqz p1, :cond_8

    .line 160
    .line 161
    new-instance v0, Ljava/util/HashSet;

    .line 162
    .line 163
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_8

    .line 171
    .line 172
    new-instance v0, Ljava/util/HashSet;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-nez v2, :cond_7

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    throw v5

    .line 196
    :cond_8
    :goto_4
    const-string v0, "Glide"

    .line 197
    .line 198
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_a

    .line 203
    .line 204
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-nez v2, :cond_9

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    throw v5

    .line 223
    :cond_a
    :goto_5
    iput-object v5, v1, Lcom/bumptech/glide/e;->n:Lf9/x;

    .line 224
    .line 225
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-nez v2, :cond_1d

    .line 234
    .line 235
    iget-object v0, v1, Lcom/bumptech/glide/e;->g:La4/c;

    .line 236
    .line 237
    const/4 v2, 0x4

    .line 238
    const/4 v3, 0x0

    .line 239
    if-nez v0, :cond_d

    .line 240
    .line 241
    new-instance v0, Lx3/a;

    .line 242
    .line 243
    invoke-direct {v0}, Lx3/a;-><init>()V

    .line 244
    .line 245
    .line 246
    sget v5, La4/c;->c:I

    .line 247
    .line 248
    if-nez v5, :cond_b

    .line 249
    .line 250
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    sput v5, La4/c;->c:I

    .line 263
    .line 264
    :cond_b
    sget v8, La4/c;->c:I

    .line 265
    .line 266
    const-string v5, "source"

    .line 267
    .line 268
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-nez v6, :cond_c

    .line 273
    .line 274
    new-instance v13, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 275
    .line 276
    const-wide/16 v9, 0x0

    .line 277
    .line 278
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 279
    .line 280
    new-instance v12, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 281
    .line 282
    invoke-direct {v12}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 283
    .line 284
    .line 285
    new-instance v7, La4/a;

    .line 286
    .line 287
    invoke-direct {v7, v0, v5, v3}, La4/a;-><init>(Lx3/a;Ljava/lang/String;Z)V

    .line 288
    .line 289
    .line 290
    move-object v6, v13

    .line 291
    move-object v0, v7

    .line 292
    move v7, v8

    .line 293
    move-object v5, v13

    .line 294
    move-object v13, v0

    .line 295
    invoke-direct/range {v6 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 296
    .line 297
    .line 298
    new-instance v0, La4/c;

    .line 299
    .line 300
    invoke-direct {v0, v5}, La4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 301
    .line 302
    .line 303
    iput-object v0, v1, Lcom/bumptech/glide/e;->g:La4/c;

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 307
    .line 308
    const-string v1, "Name must be non-null and non-empty, but given: source"

    .line 309
    .line 310
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v0

    .line 314
    :cond_d
    :goto_6
    iget-object v0, v1, Lcom/bumptech/glide/e;->h:La4/c;

    .line 315
    .line 316
    const/4 v5, 0x1

    .line 317
    if-nez v0, :cond_f

    .line 318
    .line 319
    sget v0, La4/c;->c:I

    .line 320
    .line 321
    new-instance v0, Lx3/a;

    .line 322
    .line 323
    invoke-direct {v0}, Lx3/a;-><init>()V

    .line 324
    .line 325
    .line 326
    const-string v6, "disk-cache"

    .line 327
    .line 328
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 329
    .line 330
    .line 331
    move-result v7

    .line 332
    if-nez v7, :cond_e

    .line 333
    .line 334
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 335
    .line 336
    const-wide/16 v19, 0x0

    .line 337
    .line 338
    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 339
    .line 340
    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 341
    .line 342
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 343
    .line 344
    .line 345
    new-instance v8, La4/a;

    .line 346
    .line 347
    invoke-direct {v8, v0, v6, v5}, La4/a;-><init>(Lx3/a;Ljava/lang/String;Z)V

    .line 348
    .line 349
    .line 350
    const/16 v18, 0x1

    .line 351
    .line 352
    move-object/from16 v16, v7

    .line 353
    .line 354
    move/from16 v17, v18

    .line 355
    .line 356
    move-object/from16 v23, v8

    .line 357
    .line 358
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 359
    .line 360
    .line 361
    new-instance v0, La4/c;

    .line 362
    .line 363
    invoke-direct {v0, v7}, La4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 364
    .line 365
    .line 366
    iput-object v0, v1, Lcom/bumptech/glide/e;->h:La4/c;

    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 370
    .line 371
    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    .line 372
    .line 373
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_f
    :goto_7
    iget-object v0, v1, Lcom/bumptech/glide/e;->o:La4/c;

    .line 378
    .line 379
    if-nez v0, :cond_13

    .line 380
    .line 381
    sget v0, La4/c;->c:I

    .line 382
    .line 383
    if-nez v0, :cond_10

    .line 384
    .line 385
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    sput v0, La4/c;->c:I

    .line 398
    .line 399
    :cond_10
    sget v0, La4/c;->c:I

    .line 400
    .line 401
    if-lt v0, v2, :cond_11

    .line 402
    .line 403
    move v8, v4

    .line 404
    goto :goto_8

    .line 405
    :cond_11
    move v8, v5

    .line 406
    :goto_8
    new-instance v0, Lx3/a;

    .line 407
    .line 408
    invoke-direct {v0}, Lx3/a;-><init>()V

    .line 409
    .line 410
    .line 411
    const-string v2, "animation"

    .line 412
    .line 413
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    if-nez v4, :cond_12

    .line 418
    .line 419
    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 420
    .line 421
    const-wide/16 v9, 0x0

    .line 422
    .line 423
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 424
    .line 425
    new-instance v12, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 426
    .line 427
    invoke-direct {v12}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 428
    .line 429
    .line 430
    new-instance v13, La4/a;

    .line 431
    .line 432
    invoke-direct {v13, v0, v2, v5}, La4/a;-><init>(Lx3/a;Ljava/lang/String;Z)V

    .line 433
    .line 434
    .line 435
    move-object v6, v4

    .line 436
    move v7, v8

    .line 437
    invoke-direct/range {v6 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 438
    .line 439
    .line 440
    new-instance v0, La4/c;

    .line 441
    .line 442
    invoke-direct {v0, v4}, La4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 443
    .line 444
    .line 445
    iput-object v0, v1, Lcom/bumptech/glide/e;->o:La4/c;

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 449
    .line 450
    const-string v1, "Name must be non-null and non-empty, but given: animation"

    .line 451
    .line 452
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    throw v0

    .line 456
    :cond_13
    :goto_9
    iget-object v0, v1, Lcom/bumptech/glide/e;->j:Lb2/j;

    .line 457
    .line 458
    if-nez v0, :cond_14

    .line 459
    .line 460
    new-instance v0, Lz3/i;

    .line 461
    .line 462
    invoke-direct {v0, v15}, Lz3/i;-><init>(Landroid/content/Context;)V

    .line 463
    .line 464
    .line 465
    new-instance v2, Lb2/j;

    .line 466
    .line 467
    invoke-direct {v2, v0}, Lb2/j;-><init>(Lz3/i;)V

    .line 468
    .line 469
    .line 470
    iput-object v2, v1, Lcom/bumptech/glide/e;->j:Lb2/j;

    .line 471
    .line 472
    :cond_14
    iget-object v0, v1, Lcom/bumptech/glide/e;->k:Lf9/x;

    .line 473
    .line 474
    if-nez v0, :cond_15

    .line 475
    .line 476
    new-instance v0, Lf9/x;

    .line 477
    .line 478
    const/16 v2, 0x12

    .line 479
    .line 480
    invoke-direct {v0, v2}, Lf9/x;-><init>(I)V

    .line 481
    .line 482
    .line 483
    iput-object v0, v1, Lcom/bumptech/glide/e;->k:Lf9/x;

    .line 484
    .line 485
    :cond_15
    iget-object v0, v1, Lcom/bumptech/glide/e;->d:Ly3/d;

    .line 486
    .line 487
    if-nez v0, :cond_17

    .line 488
    .line 489
    iget-object v0, v1, Lcom/bumptech/glide/e;->j:Lb2/j;

    .line 490
    .line 491
    iget v0, v0, Lb2/j;->a:I

    .line 492
    .line 493
    if-lez v0, :cond_16

    .line 494
    .line 495
    new-instance v2, Ly3/i;

    .line 496
    .line 497
    int-to-long v4, v0

    .line 498
    invoke-direct {v2, v4, v5}, Ly3/i;-><init>(J)V

    .line 499
    .line 500
    .line 501
    iput-object v2, v1, Lcom/bumptech/glide/e;->d:Ly3/d;

    .line 502
    .line 503
    goto :goto_a

    .line 504
    :cond_16
    new-instance v0, Landroidx/lifecycle/q0;

    .line 505
    .line 506
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 507
    .line 508
    .line 509
    iput-object v0, v1, Lcom/bumptech/glide/e;->d:Ly3/d;

    .line 510
    .line 511
    :cond_17
    :goto_a
    iget-object v0, v1, Lcom/bumptech/glide/e;->e:Ly3/h;

    .line 512
    .line 513
    if-nez v0, :cond_18

    .line 514
    .line 515
    new-instance v0, Ly3/h;

    .line 516
    .line 517
    iget-object v2, v1, Lcom/bumptech/glide/e;->j:Lb2/j;

    .line 518
    .line 519
    iget v2, v2, Lb2/j;->c:I

    .line 520
    .line 521
    invoke-direct {v0, v2}, Ly3/h;-><init>(I)V

    .line 522
    .line 523
    .line 524
    iput-object v0, v1, Lcom/bumptech/glide/e;->e:Ly3/h;

    .line 525
    .line 526
    :cond_18
    iget-object v0, v1, Lcom/bumptech/glide/e;->f:Lz3/g;

    .line 527
    .line 528
    if-nez v0, :cond_19

    .line 529
    .line 530
    new-instance v0, Lz3/g;

    .line 531
    .line 532
    iget-object v2, v1, Lcom/bumptech/glide/e;->j:Lb2/j;

    .line 533
    .line 534
    iget v2, v2, Lb2/j;->b:I

    .line 535
    .line 536
    int-to-long v4, v2

    .line 537
    invoke-direct {v0, v4, v5}, Lz3/g;-><init>(J)V

    .line 538
    .line 539
    .line 540
    iput-object v0, v1, Lcom/bumptech/glide/e;->f:Lz3/g;

    .line 541
    .line 542
    :cond_19
    iget-object v0, v1, Lcom/bumptech/glide/e;->i:Lz3/f;

    .line 543
    .line 544
    if-nez v0, :cond_1a

    .line 545
    .line 546
    new-instance v0, Lz3/f;

    .line 547
    .line 548
    invoke-direct {v0, v15}, Lz3/f;-><init>(Landroid/content/Context;)V

    .line 549
    .line 550
    .line 551
    iput-object v0, v1, Lcom/bumptech/glide/e;->i:Lz3/f;

    .line 552
    .line 553
    :cond_1a
    iget-object v0, v1, Lcom/bumptech/glide/e;->c:Lx3/q;

    .line 554
    .line 555
    if-nez v0, :cond_1b

    .line 556
    .line 557
    new-instance v0, Lx3/q;

    .line 558
    .line 559
    iget-object v5, v1, Lcom/bumptech/glide/e;->f:Lz3/g;

    .line 560
    .line 561
    iget-object v6, v1, Lcom/bumptech/glide/e;->i:Lz3/f;

    .line 562
    .line 563
    iget-object v7, v1, Lcom/bumptech/glide/e;->h:La4/c;

    .line 564
    .line 565
    iget-object v8, v1, Lcom/bumptech/glide/e;->g:La4/c;

    .line 566
    .line 567
    new-instance v9, La4/c;

    .line 568
    .line 569
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    sget-wide v19, La4/c;->b:J

    .line 574
    .line 575
    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 576
    .line 577
    new-instance v22, Ljava/util/concurrent/SynchronousQueue;

    .line 578
    .line 579
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 580
    .line 581
    .line 582
    new-instance v4, La4/a;

    .line 583
    .line 584
    new-instance v10, Lx3/a;

    .line 585
    .line 586
    invoke-direct {v10}, Lx3/a;-><init>()V

    .line 587
    .line 588
    .line 589
    const-string v11, "source-unlimited"

    .line 590
    .line 591
    invoke-direct {v4, v10, v11, v3}, La4/a;-><init>(Lx3/a;Ljava/lang/String;Z)V

    .line 592
    .line 593
    .line 594
    const v18, 0x7fffffff

    .line 595
    .line 596
    .line 597
    move-object/from16 v16, v2

    .line 598
    .line 599
    move-object/from16 v23, v4

    .line 600
    .line 601
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 602
    .line 603
    .line 604
    invoke-direct {v9, v2}, La4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 605
    .line 606
    .line 607
    iget-object v10, v1, Lcom/bumptech/glide/e;->o:La4/c;

    .line 608
    .line 609
    move-object v4, v0

    .line 610
    invoke-direct/range {v4 .. v10}, Lx3/q;-><init>(Lz3/g;Lz3/d;La4/c;La4/c;La4/c;La4/c;)V

    .line 611
    .line 612
    .line 613
    iput-object v0, v1, Lcom/bumptech/glide/e;->c:Lx3/q;

    .line 614
    .line 615
    :cond_1b
    iget-object v0, v1, Lcom/bumptech/glide/e;->p:Ljava/util/List;

    .line 616
    .line 617
    if-nez v0, :cond_1c

    .line 618
    .line 619
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    iput-object v0, v1, Lcom/bumptech/glide/e;->p:Ljava/util/List;

    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_1c
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    iput-object v0, v1, Lcom/bumptech/glide/e;->p:Ljava/util/List;

    .line 631
    .line 632
    :goto_b
    iget-object v0, v1, Lcom/bumptech/glide/e;->b:Landroidx/lifecycle/b0;

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    new-instance v13, Landroidx/lifecycle/b0;

    .line 638
    .line 639
    invoke-direct {v13, v0}, Landroidx/lifecycle/b0;-><init>(Landroidx/lifecycle/b0;)V

    .line 640
    .line 641
    .line 642
    new-instance v8, Li4/n;

    .line 643
    .line 644
    iget-object v0, v1, Lcom/bumptech/glide/e;->n:Lf9/x;

    .line 645
    .line 646
    invoke-direct {v8, v0}, Li4/n;-><init>(Lf9/x;)V

    .line 647
    .line 648
    .line 649
    new-instance v0, Lcom/bumptech/glide/b;

    .line 650
    .line 651
    iget-object v4, v1, Lcom/bumptech/glide/e;->c:Lx3/q;

    .line 652
    .line 653
    iget-object v5, v1, Lcom/bumptech/glide/e;->f:Lz3/g;

    .line 654
    .line 655
    iget-object v6, v1, Lcom/bumptech/glide/e;->d:Ly3/d;

    .line 656
    .line 657
    iget-object v7, v1, Lcom/bumptech/glide/e;->e:Ly3/h;

    .line 658
    .line 659
    iget-object v9, v1, Lcom/bumptech/glide/e;->k:Lf9/x;

    .line 660
    .line 661
    iget v10, v1, Lcom/bumptech/glide/e;->l:I

    .line 662
    .line 663
    iget-object v11, v1, Lcom/bumptech/glide/e;->m:Lk3/d;

    .line 664
    .line 665
    iget-object v12, v1, Lcom/bumptech/glide/e;->a:Ln/e;

    .line 666
    .line 667
    iget-object v1, v1, Lcom/bumptech/glide/e;->p:Ljava/util/List;

    .line 668
    .line 669
    move-object v2, v0

    .line 670
    move-object v3, v15

    .line 671
    move-object/from16 v16, v13

    .line 672
    .line 673
    move-object v13, v1

    .line 674
    move-object v1, v15

    .line 675
    move-object/from16 v15, p1

    .line 676
    .line 677
    invoke-direct/range {v2 .. v16}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lx3/q;Lz3/g;Ly3/d;Ly3/h;Li4/n;Lf9/x;ILk3/d;Ln/e;Ljava/util/List;Ljava/util/ArrayList;Lr6/h0;Landroidx/lifecycle/b0;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 681
    .line 682
    .line 683
    sput-object v0, Lcom/bumptech/glide/b;->y:Lcom/bumptech/glide/b;

    .line 684
    .line 685
    return-void

    .line 686
    :cond_1d
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    throw v5
.end method

.method public static d(Landroid/content/Context;)Lcom/bumptech/glide/o;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/bumptech/glide/b;->e:Li4/n;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Li4/n;->b(Landroid/content/Context;)Lcom/bumptech/glide/o;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 15
    .line 16
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method


# virtual methods
.method public final c(Lcom/bumptech/glide/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "Cannot unregister not yet registered manager"

    .line 22
    .line 23
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    .line 1
    invoke-static {}, Lp4/m;->a()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iget-object v2, p0, Lcom/bumptech/glide/b;->b:Lz3/g;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Lp4/i;->e(J)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/b;->a:Ly3/d;

    .line 12
    .line 13
    invoke-interface {v0}, Ly3/d;->s()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/bumptech/glide/b;->d:Ly3/h;

    .line 17
    .line 18
    invoke-virtual {v0}, Ly3/h;->a()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 3

    .line 1
    invoke-static {}, Lp4/m;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/bumptech/glide/o;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Lz3/g;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lz3/g;->f(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/bumptech/glide/b;->a:Ly3/d;

    .line 36
    .line 37
    invoke-interface {v0, p1}, Ly3/d;->p(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/bumptech/glide/b;->d:Ly3/h;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ly3/h;->i(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1
.end method
