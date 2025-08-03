//package com.example.mindbodywellness.ui.theme.theme
//
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.unit.dp
//
//// Close Icon
//val IcClose: ImageVector = ImageVector.Builder(
//    name = "close",
//    defaultWidth = 24.dp,
//    defaultHeight = 24.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M205.66,194.34a8,8,0,0,1-11.32,11.32L128,139.31,61.66,205.66a8,8,0,0,1-11.32-11.32L116.69,128,50.34,61.66A8,8,0,0,1,61.66,50.34L128,116.69l66.34-66.35a8,8,0,0,1,11.32,11.32L139.31,128Z",
//    fill = Color.Black // This will be overridden by `tint` in Icon composable
//).build()
//
//// Skip Back Icon
//val IcSkipBack: ImageVector = ImageVector.Builder(
//    name = "skip_back",
//    defaultWidth = 32.dp,
//    defaultHeight = 32.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M208,47.88V208.12a16,16,0,0,1-24.43,13.43L64,146.77V216a8,8,0,0,1-16,0V40a8,8,0,0,1,16,0v69.23L183.57,34.45A15.95,15.95,0,0,1,208,47.88Z",
//    fill = Color.Black
//).build()
//
//// Rewind Icon
//val IcRewind: ImageVector = ImageVector.Builder(
//    name = "rewind",
//    defaultWidth = 32.dp,
//    defaultHeight = 32.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M232,71.84V184.16a15.92,15.92,0,0,1-24.48,13.34L128,146.86v37.3a15.92,15.92,0,0,1-24.48,13.34L15.33,141.34a15.8,15.8,0,0,1,0-26.68L103.52,58.5A15.91,15.91,0,0,1,128,71.84v37.3L207.52,58.5A15.91,15.91,0,0,1,232,71.84Z",
//    fill = Color.Black
//).build()
//
//// Play Icon
//val IcPlay: ImageVector = ImageVector.Builder(
//    name = "play",
//    defaultWidth = 32.dp,
//    defaultHeight = 32.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M240,128a15.74,15.74,0,0,1-7.6,13.51L88.32,229.65a16,16,0,0,1-16.2.3A15.86,15.86,0,0,1,64,216.13V39.87a15.86,15.86,0,0,1,8.12-13.82,16,16,0,0,1,16.2.3L232.4,114.49A15.74,15.74,0,0,1,240,128Z",
//    fill = Color.Black
//).build()
//
//// Fast Forward Icon
//val IcFastForward: ImageVector = ImageVector.Builder(
//    name = "fast_forward",
//    defaultWidth = 32.dp,
//    defaultHeight = 32.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M248,128a15.76,15.76,0,0,1-7.33,13.34L152.48,197.5A15.91,15.91,0,0,1,128,184.16v-37.3L48.48,197.5A15.91,15.91,0,0,1,24,184.16V71.84A15.91,15.91,0,0,1,48.48,58.5L128,109.14V71.84A15.91,15.91,0,0,1,152.48,58.5l88.19,56.16A15.76,15.76,0,0,1,248,128Z",
//    fill = Color.Black
//).build()
//
//// Skip Forward Icon
//val IcSkipForward: ImageVector = ImageVector.Builder(
//    name = "skip_forward",
//    defaultWidth = 32.dp,
//    defaultHeight = 32.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M208,40V216a8,8,0,0,1-16,0V146.77L72.43,221.55A15.95,15.95,0,0,1,48,208.12V47.88A15.95,15.95,0,0,1,72.43,34.45L192,109.23V40a8,8,0,0,1,16,0Z",
//    fill = Color.Black
//).build()
//
//// Heart Icon
//val IcHeart: ImageVector = ImageVector.Builder(
//    name = "heart",
//    defaultWidth = 24.dp,
//    defaultHeight = 24.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M178,32c-20.65,0-38.73,8.88-50,23.89C116.73,40.88,98.65,32,78,32A62.07,62.07,0,0,0,16,94c0,70,103.79,126.66,108.21,129a8,8,0,0,0,7.58,0C136.21,220.66,240,164,240,94A62.07,62.07,0,0,0,178,32ZM128,206.8C109.74,196.16,32,147.69,32,94A46.06,46.06,0,0,1,78,48c19.45,0,35.78,10.36,42.6,27a8,8,0,0,0,14.8,0c6.82-16.67,23.15-27,42.6-27a46.06,46.06,0,0,1,46,46C224,147.61,146.24,196.15,128,206.8Z",
//    fill = Color.Black
//).build()
//
//// Bookmark Icon
//val IcBookmark: ImageVector = ImageVector.Builder(
//    name = "bookmark",
//    defaultWidth = 24.dp,
//    defaultHeight = 24.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M184,32H72A16,16,0,0,0,56,48V224a8,8,0,0,0,12.24,6.78L128,193.43l59.77,37.35A8,8,0,0,0,200,224V48A16,16,0,0,0,184,32Zm0,16V161.57l-51.77-32.35a8,8,0,0,0-8.48,0L72,161.56V48ZM132.23,177.22a8,8,0,0,0-8.48,0L72,209.57V180.43l56-35,56,35v29.14Z",
//    fill = Color.Black
//).build()
//
//// Share Icon
//val IcShare: ImageVector = ImageVector.Builder(
//    name = "share",
//    defaultWidth = 24.dp,
//    defaultHeight = 24.dp,
//    viewportWidth = 256f,
//    viewportHeight = 256f
//).addPath(
//    pathData = "M229.66,109.66l-48,48a8,8,0,0,1-11.32-11.32L204.69,112H165a88,88,0,0,0-85.23,66,8,8,0,0,1-15.5-4A103.94,103.94,0,0,1,165,96h39.71L170.34,61.66a8,8,0,0,1,11.32-11.32l48,48A8,8,0,0,1,229.66,109.66ZM192,208H40V88a8,8,0,0,0-16,0V208a16,16,0,0,0,16,16H192a8,8,0,0,0,0-16Z",
//    fill = Color.Black
//).build()