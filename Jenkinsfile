node {
// git "https://github.com/khatilov/cc.git"  "https://github.com/repoAPS2/Jenkins_SA.git" 
git "https://github.com/repoAPS2/" + repo + ".git"
def mvnHome = tool 'Maven_3.5.0'
// sh "'${mvnHome}/bin/mvn' clean site -Dgroups=all"
sh "'${mvnHome}/bin/mvn' clean site -Dgroups=" + group
stage('Test') 		   {step([$class: 'Publisher', testResults: '**/testng-results.xml'])}
stage('Code Coverage') {step([$class: 'JacocoPublisher', execPattern:'**/**.exec', classPattern: '**/classes', sourcePattern: '**/src/main/java'])}
}