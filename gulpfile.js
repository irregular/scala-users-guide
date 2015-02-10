var gulp = require('gulp'),
    layout = require('gulp-file-wrapper'),
    fileinclude = require('gulp-file-include'),
    livereload = require('gulp-livereload'),
    sass = require('gulp-sass');

gulp.task('default', function(){
  livereload.listen();
  gulp.watch('src/**/*.html', ['html']);
  gulp.watch('src/scss/*.scss', ['sass']);
});

gulp.task('html', function(){
  gulp.src('src/*.html')
    .pipe(layout('src/layouts/base.html'))
    .pipe(fileinclude({
          prefix: '@@',
          basepath: '@file'
    }))
    .pipe(gulp.dest('dist'))
    .pipe(livereload());
});

gulp.task('sass', function () {
  gulp.src('src/scss/*.scss')
    .pipe(sass({errLogToConsole: true}))
    .pipe(gulp.dest('dist/css'))
    .pipe(livereload());
});
