.class public final Landroidx/appcompat/widget/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/u;


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/appcompat/widget/d0;->a:I

    .line 3
    iput-object p1, p0, Landroidx/appcompat/widget/d0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 20

    move-object/from16 v0, p0

    .line 4
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v1

    iput v1, v0, Landroidx/appcompat/widget/d0;->a:I

    .line 6
    invoke-static {}, Lj5/a;->g()V

    .line 7
    iget v1, v0, Landroidx/appcompat/widget/d0;->a:I

    const v2, 0x8b31

    move-object/from16 v3, p1

    invoke-static {v1, v2, v3}, Landroidx/appcompat/widget/d0;->b(IILjava/lang/String;)V

    .line 8
    iget v1, v0, Landroidx/appcompat/widget/d0;->a:I

    const v2, 0x8b30

    move-object/from16 v3, p2

    invoke-static {v1, v2, v3}, Landroidx/appcompat/widget/d0;->b(IILjava/lang/String;)V

    .line 9
    iget v1, v0, Landroidx/appcompat/widget/d0;->a:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 v1, 0x0

    .line 10
    filled-new-array {v1}, [I

    move-result-object v2

    .line 11
    iget v3, v0, Landroidx/appcompat/widget/d0;->a:I

    const v4, 0x8b82

    invoke-static {v3, v4, v2, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 12
    aget v2, v2, v1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unable to link shader program: \n"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v0, Landroidx/appcompat/widget/d0;->a:I

    .line 13
    invoke-static {v5}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-static {v4, v2}, Lj5/a;->h(Ljava/lang/String;Z)V

    .line 15
    iget v2, v0, Landroidx/appcompat/widget/d0;->a:I

    invoke-static {v2}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 16
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    new-array v2, v3, [I

    .line 17
    iget v4, v0, Landroidx/appcompat/widget/d0;->a:I

    const v5, 0x8b89

    invoke-static {v4, v5, v2, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v4, v2, v1

    .line 18
    new-array v4, v4, [Ld0/h;

    iput-object v4, v0, Landroidx/appcompat/widget/d0;->b:Ljava/lang/Object;

    move v4, v1

    :goto_1
    aget v5, v2, v1

    if-ge v4, v5, :cond_3

    .line 19
    iget v15, v0, Landroidx/appcompat/widget/d0;->a:I

    new-array v5, v3, [I

    const v6, 0x8b8a

    .line 20
    invoke-static {v15, v6, v5, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v14, v5, v1

    .line 21
    new-array v13, v14, [B

    new-array v8, v3, [I

    const/4 v9, 0x0

    new-array v10, v3, [I

    const/4 v11, 0x0

    new-array v12, v3, [I

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v5, v15

    move v6, v4

    move v7, v14

    move-object/from16 p1, v13

    move/from16 v13, v16

    move v3, v14

    move-object/from16 v14, p1

    move/from16 v18, v15

    move/from16 v15, v17

    .line 22
    invoke-static/range {v5 .. v15}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 23
    new-instance v5, Ljava/lang/String;

    move v14, v1

    :goto_2
    if-ge v14, v3, :cond_2

    move-object/from16 v6, p1

    .line 24
    aget-byte v7, v6, v14

    if-nez v7, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v14, v14, 0x1

    move-object/from16 p1, v6

    goto :goto_2

    :cond_2
    move-object/from16 v6, p1

    move v14, v3

    .line 25
    :goto_3
    invoke-direct {v5, v6, v1, v14}, Ljava/lang/String;-><init>([BII)V

    move/from16 v3, v18

    .line 26
    invoke-static {v3, v5}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v3

    .line 27
    new-instance v6, Ld0/h;

    invoke-direct {v6, v5, v3}, Ld0/h;-><init>(Ljava/lang/Object;I)V

    .line 28
    iget-object v3, v0, Landroidx/appcompat/widget/d0;->b:Ljava/lang/Object;

    check-cast v3, [Ld0/h;

    aput-object v6, v3, v4

    .line 29
    iget-object v3, v0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v5, v6, Ld0/h;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x1

    goto :goto_1

    .line 30
    :cond_3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Landroidx/appcompat/widget/d0;->e:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v3, v2, [I

    .line 31
    iget v4, v0, Landroidx/appcompat/widget/d0;->a:I

    const v5, 0x8b86

    invoke-static {v4, v5, v3, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v4, v3, v1

    .line 32
    new-array v4, v4, [Lf1/f;

    iput-object v4, v0, Landroidx/appcompat/widget/d0;->c:Ljava/lang/Object;

    move v4, v1

    :goto_4
    aget v5, v3, v1

    if-ge v4, v5, :cond_6

    .line 33
    iget v15, v0, Landroidx/appcompat/widget/d0;->a:I

    new-array v5, v2, [I

    const v6, 0x8b87

    .line 34
    invoke-static {v15, v6, v5, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    new-array v14, v2, [I

    aget v13, v5, v1

    .line 35
    new-array v12, v13, [B

    new-array v8, v2, [I

    const/4 v9, 0x0

    new-array v10, v2, [I

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v5, v15

    move v6, v4

    move v7, v13

    move-object/from16 p1, v12

    move-object v12, v14

    move v2, v13

    move/from16 v13, v16

    move-object/from16 v16, v14

    move-object/from16 v14, p1

    move/from16 v19, v15

    move/from16 v15, v17

    .line 36
    invoke-static/range {v5 .. v15}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 37
    new-instance v5, Ljava/lang/String;

    move v13, v1

    :goto_5
    if-ge v13, v2, :cond_5

    move-object/from16 v6, p1

    .line 38
    aget-byte v7, v6, v13

    if-nez v7, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v13, v13, 0x1

    move-object/from16 p1, v6

    goto :goto_5

    :cond_5
    move-object/from16 v6, p1

    move v13, v2

    .line 39
    :goto_6
    invoke-direct {v5, v6, v1, v13}, Ljava/lang/String;-><init>([BII)V

    move/from16 v2, v19

    .line 40
    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 41
    new-instance v6, Lf1/f;

    aget v7, v16, v1

    invoke-direct {v6, v5, v2, v7}, Lf1/f;-><init>(Ljava/lang/String;II)V

    .line 42
    iget-object v2, v0, Landroidx/appcompat/widget/d0;->c:Ljava/lang/Object;

    check-cast v2, [Lf1/f;

    aput-object v6, v2, v4

    .line 43
    iget-object v2, v0, Landroidx/appcompat/widget/d0;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    const/4 v2, 0x1

    goto :goto_4

    .line 44
    :cond_6
    invoke-static {}, Lj5/a;->g()V

    return-void
.end method

.method public static b(IILjava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x8b81

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v2, v1, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 20
    .line 21
    .line 22
    aget v1, v1, v0

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    move v0, v2

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, ", source: "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p2, v0}, Lj5/a;->h(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lj5/a;->g()V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/appcompat/widget/d0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Landroidx/appcompat/widget/d0;->a:I

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    throw p1

    .line 22
    :cond_1
    throw p1
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Landroidx/appcompat/widget/v1;->a(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz v1, :cond_9

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/appcompat/widget/d0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroidx/appcompat/widget/x3;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move v5, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v5, v3

    .line 27
    :goto_0
    if-eqz v5, :cond_7

    .line 28
    .line 29
    iget-object v5, p0, Landroidx/appcompat/widget/d0;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, Landroidx/appcompat/widget/x3;

    .line 32
    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    new-instance v5, Landroidx/appcompat/widget/x3;

    .line 36
    .line 37
    invoke-direct {v5, v3}, Landroidx/appcompat/widget/x3;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object v5, p0, Landroidx/appcompat/widget/d0;->e:Ljava/lang/Object;

    .line 41
    .line 42
    :cond_2
    iget-object v5, p0, Landroidx/appcompat/widget/d0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Landroidx/appcompat/widget/x3;

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    iput-object v6, v5, Landroidx/appcompat/widget/x3;->d:Ljava/lang/Object;

    .line 48
    .line 49
    iput-boolean v3, v5, Landroidx/appcompat/widget/x3;->c:Z

    .line 50
    .line 51
    iput-object v6, v5, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 52
    .line 53
    iput-boolean v3, v5, Landroidx/appcompat/widget/x3;->b:Z

    .line 54
    .line 55
    invoke-static {v0}, Lk0/f;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    iput-boolean v4, v5, Landroidx/appcompat/widget/x3;->c:Z

    .line 62
    .line 63
    iput-object v6, v5, Landroidx/appcompat/widget/x3;->d:Ljava/lang/Object;

    .line 64
    .line 65
    :cond_3
    invoke-static {v0}, Lk0/f;->b(Landroid/widget/ImageView;)Landroid/graphics/PorterDuff$Mode;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_4

    .line 70
    .line 71
    iput-boolean v4, v5, Landroidx/appcompat/widget/x3;->b:Z

    .line 72
    .line 73
    iput-object v6, v5, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 74
    .line 75
    :cond_4
    iget-boolean v6, v5, Landroidx/appcompat/widget/x3;->c:Z

    .line 76
    .line 77
    if-nez v6, :cond_5

    .line 78
    .line 79
    iget-boolean v6, v5, Landroidx/appcompat/widget/x3;->b:Z

    .line 80
    .line 81
    if-eqz v6, :cond_6

    .line 82
    .line 83
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v1, v5, v3}, Landroidx/appcompat/widget/x;->e(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/x3;[I)V

    .line 88
    .line 89
    .line 90
    move v3, v4

    .line 91
    :cond_6
    if-eqz v3, :cond_7

    .line 92
    .line 93
    return-void

    .line 94
    :cond_7
    iget-object v3, p0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Landroidx/appcompat/widget/x3;

    .line 97
    .line 98
    if-eqz v3, :cond_8

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v1, v3, v0}, Landroidx/appcompat/widget/x;->e(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/x3;[I)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_8
    if-eqz v2, :cond_9

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v1, v2, v0}, Landroidx/appcompat/widget/x;->e(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/x3;[I)V

    .line 115
    .line 116
    .line 117
    :cond_9
    :goto_1
    return-void
.end method

.method public final d(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/d0;->a:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lj5/a;->g()V

    .line 11
    .line 12
    .line 13
    return p1
.end method

.method public final e(Landroid/util/AttributeSet;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Le/a;->f:[I

    .line 11
    .line 12
    invoke-static {v2, p1, v3, p2}, Landroidx/appcompat/widget/o3;->m(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroidx/appcompat/widget/o3;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v4, v7, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v4

    .line 23
    check-cast v5, Landroid/content/res/TypedArray;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    move v6, p2

    .line 27
    invoke-static/range {v1 .. v6}, Lg0/y0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    move-object p1, v0

    .line 31
    check-cast p1, Landroid/widget/ImageView;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 p2, -0x1

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-virtual {v7, v1, p2}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eq v1, p2, :cond_0

    .line 46
    .line 47
    move-object p1, v0

    .line 48
    check-cast p1, Landroid/widget/ImageView;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1, v1}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    move-object v1, v0

    .line 61
    check-cast v1, Landroid/widget/ImageView;

    .line 62
    .line 63
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-static {p1}, Landroidx/appcompat/widget/v1;->a(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p1, 0x2

    .line 72
    invoke-virtual {v7, p1}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    move-object v1, v0

    .line 79
    check-cast v1, Landroid/widget/ImageView;

    .line 80
    .line 81
    invoke-virtual {v7, p1}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {v1, p1}, Lk0/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    const/4 p1, 0x3

    .line 89
    invoke-virtual {v7, p1}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    check-cast v0, Landroid/widget/ImageView;

    .line 96
    .line 97
    invoke-virtual {v7, p1, p2}, Landroidx/appcompat/widget/o3;->h(II)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    const/4 p2, 0x0

    .line 102
    invoke-static {p1, p2}, Landroidx/appcompat/widget/v1;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {v0, p1}, Lk0/f;->d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-virtual {v7}, Landroidx/appcompat/widget/o3;->p()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    invoke-virtual {v7}, Landroidx/appcompat/widget/o3;->p()V

    .line 115
    .line 116
    .line 117
    throw p1
.end method

.method public final f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    check-cast v0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1, p1}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Landroidx/appcompat/widget/v1;->a(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    check-cast v0, Landroid/widget/ImageView;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/d0;->c()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final g(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/x3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/widget/x3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/x3;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/appcompat/widget/x3;

    .line 18
    .line 19
    iput-object p1, v0, Landroidx/appcompat/widget/x3;->d:Ljava/lang/Object;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, v0, Landroidx/appcompat/widget/x3;->c:Z

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/appcompat/widget/d0;->c()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final h(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/x3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/widget/x3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/x3;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/d0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/appcompat/widget/x3;

    .line 18
    .line 19
    iput-object p1, v0, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, v0, Landroidx/appcompat/widget/x3;->b:Z

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/appcompat/widget/d0;->c()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
